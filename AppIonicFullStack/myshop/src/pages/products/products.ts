import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ToastController, AlertController, ModalController } from 'ionic-angular';
import { LoginPage } from '../login/login';
import { ListPage } from '../list/list';
import { CartPage } from '../cart/cart';
import { ProductsService } from '../../providers/products-service';
import { ProductsModalPage } from './products-modal';
import { ProductsUpdatePage } from './products-update';

@IonicPage()
@Component({
  selector: 'page-list',
  templateUrl: 'products.html'
})

export class ProductsPage {
  protected products: Array<any>;

  constructor(public navCtrl: NavController, public navParams: NavParams, public productsService: ProductsService, public alertCtrl: AlertController, public toastCtrl: ToastController, public modalCtrl: ModalController) {
  }

  ionViewWillEnter() {
    this.productsService.getProducts().subscribe(products => {
      this.products = products;
    })
  }

  remove(products) {
    let alertCtrl = this.alertCtrl.create({
      title: 'Delete product',
      message: 'Do you want to delete this product?',
      buttons: [
        {
          text: 'Cancel',
          role: 'cancel'
        },
        {
          text: 'Confirm',
          handler: () => {
            this.productsService.remove(products.product_id).subscribe(response => {
              for (let i = 0; i < this.products.length; i++) {
                if(this.products[i] == products) {
                  this.products.splice(i, 1);
                  let toast = this.toastCtrl.create({
                    message: 'Product "' + products.name + '"deleted.',
                    duration: 2000,
                    position: 'top'
                  });
                  toast.present();
                }
              }
            });
          }
        }
      ]
    });
    alertCtrl.present();
  }

  getProductById(product_id: number): any {
    this.productsService.getProductById(product_id).subscribe((products: any) => console.log(products));
  }

  openUpdate(product: any) {
    this.navCtrl.push(ProductsUpdatePage, { products: product, "ProductsPage": this});
  }

  openModal() {
    let modal = this.modalCtrl.create(ProductsModalPage);
    modal.present();
    modal.onDidDismiss(() => this.ionViewWillEnter())
  }

  openLogin() {
    this.navCtrl.push(LoginPage)
  }

  openList() {
    this.navCtrl.push(ListPage)
  }

  openCart() {
    this.navCtrl.push(CartPage)
  }
}
