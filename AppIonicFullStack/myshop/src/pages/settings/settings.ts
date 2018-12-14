import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ItemSliding, ToastController } from 'ionic-angular';
import { LoginPage } from '../login/login';
import { ListPage } from '../list/list';
import { CartPage } from '../cart/cart';

@IonicPage()
@Component({
  selector: 'page-settings',
  templateUrl: 'settings.html',
})
export class SettingsPage {

  settings: any[];

  constructor(public navCtrl: NavController, public navParams: NavParams, public toastCtrl: ToastController) {
    this.settings = [
      {
        title: "Your account",
        definition: "Get notified for account alerts",
      }, {
        title: "Your Shipments",
        definition: "Find out when packages ship & arrive",
      }, {
        title: "Your Recommendations",
        definition: "Receive reccomendations based on your shopping activity.",
      }, {
        title: "Your Watched & Waitlisted Deals",
        definition: "Find out when Lightning Deals happen."
      }];
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

  yes(item: ItemSliding) {
    this.expandAction(item, 'activating', 'Option activated.');
  }

  no(item: ItemSliding) {
    this.expandAction(item, 'deactivating', 'Option deactivated.');
  }

  expandAction(item: ItemSliding, _: any, text: string) {
    setTimeout(() => {
      let toast = this.toastCtrl.create({
        message: text
      });
      toast.present();
      item.close();
      setTimeout(() => toast.dismiss(), 2000);
    }, 1500);
  }

}
