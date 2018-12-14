import { Component, ViewChild } from '@angular/core';
import { NavController, Slides } from 'ionic-angular';
import { LoginPage } from '../login/login';
import { ListPage } from '../list/list';
import { CartPage } from '../cart/cart';
import { ProductsService } from '../../providers/products-service';


@Component({
  selector: 'page-home',
  templateUrl: 'home.html'
})
export class HomePage {
  protected products: Array<any>;
  @ViewChild(Slides) slides: Slides;

  constructor(public navCtrl: NavController, public productsService: ProductsService) {

  }

  ionViewDidEnter() {
    this.slides.autoplayDisableOnInteraction = false;
  }

  ionViewWillEnter() {
    this.productsService.getProducts().subscribe(products => {
      this.products = products;
    })
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
