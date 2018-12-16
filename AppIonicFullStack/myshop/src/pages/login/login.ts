import { Component } from '@angular/core';
import { IonicPage, NavController, NavParams, ModalController } from 'ionic-angular';
import { AccountModalPage } from './account-modal';
import { PasswordModalPage } from './password-modal';
@IonicPage()
@Component({
  selector: 'page-login',
  templateUrl: 'login.html',
})
export class LoginPage {

  constructor(public navCtrl: NavController, public navParams: NavParams, public modalCtrl: ModalController) {
  
  }

  ionViewDidLoad() {
  }

  openAccount() {
    let modal = this.modalCtrl.create(AccountModalPage);
    modal.present();
    modal.onDidDismiss(() => this.ionViewDidLoad())
  }

  openPassword() {
    let modal1 = this.modalCtrl.create(PasswordModalPage);
    modal1.present();
    modal1.onDidDismiss(() => this.ionViewDidLoad())
  }
}
