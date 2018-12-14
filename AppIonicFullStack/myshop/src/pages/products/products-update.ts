import { ProductsService } from '../../providers/products-service';
import { Component, ViewChild } from '@angular/core';
import { NavParams, ViewController, ToastController, NavController } from 'ionic-angular';
import { NgForm } from '@angular/forms';

@Component({
    templateUrl: './products-update.html'
})

export class ProductsUpdatePage {
    @ViewChild('name') name;
    categories: Array<any>;
    products: any = {};
    error: any;

    constructor(public productsService: ProductsService, public params: NavParams, public viewCtrl: ViewController, public toastCtrl: ToastController, public navCtrl: NavController){
        this.products = this.params.get('products');
    }

    dismiss() {
        this.viewCtrl.dismiss();
    }

    ionViewWillEnter() {
        this.productsService.getCategories().subscribe(categories => {
          this.categories = categories;
        })
    }

    save(form: NgForm) {
        console.log(form);
        this.productsService.updateProducts(form, this.products.product_id).subscribe(result => {
            let toast = this.toastCtrl.create({
                message: 'Product "' + form.name + '" ' + 'updated.',
                duration: 2000
            });
            toast.present();
            this.navCtrl.pop();
        }, error => this.error = error);
    }
}
