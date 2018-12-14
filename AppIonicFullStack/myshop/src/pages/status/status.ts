import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams } from 'ionic-angular';
import { LoginPage } from '../login/login';
import { ListPage } from '../list/list';
import { CartPage } from '../cart/cart';
import { TechserviceService } from '../../providers/techservice-service';

@IonicPage()
@Component({
  selector: 'page-status',
  templateUrl: 'status.html',
})
export class StatusPage {

  protected repairs: Array<any>;

  constructor(public navCtrl: NavController, public navParams: NavParams, public techserviceServices: TechserviceService) {
  }

  ionViewWillEnter() {
    this.techserviceServices.getRepairs().subscribe(repairs => {
      this.repairs = repairs;
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
