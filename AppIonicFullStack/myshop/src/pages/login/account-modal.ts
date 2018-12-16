import { Component, ViewChild } from '@angular/core';
import { NavParams, ViewController, ToastController, NavController } from 'ionic-angular';

@Component({
    templateUrl: './account-modal.html'
})

export class AccountModalPage {
    @ViewChild('name') name;

    constructor(public params: NavParams, public viewCtrl: ViewController, public toastCtrl: ToastController, public navCtrl: NavController){
    }

    dismiss() {
        this.viewCtrl.dismiss();
    }

}