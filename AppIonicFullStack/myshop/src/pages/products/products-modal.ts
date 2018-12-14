import { ProductsService } from '../../providers/products-service';
import { Component, ViewChild } from '@angular/core';
import { NavParams, ViewController, ToastController, NavController } from 'ionic-angular';
import { NgForm } from '@angular/forms';

@Component({
    templateUrl: './products-modal.html'
})

export class ProductsModalPage {
    @ViewChild('name') name;
    categories: Array<any>;
    products: any = {};
    error: any;

    constructor(public productsService: ProductsService, public params: NavParams, public viewCtrl: ViewController, public toastCtrl: ToastController, public navCtrl: NavController){
    }

    dismiss() {
        this.viewCtrl.dismiss();
    }

    ionViewWillEnter() {
        this.productsService.getCategories().subscribe(categories => {
          this.categories = categories;
        })
    }

    save(form : NgForm) {
        this.productsService.save(form).subscribe(result => {
            let toast = this.toastCtrl.create({
                message: 'Product "' + form.name + '" ' + 'added.',
                duration: 2000
            });
            toast.present();
            this.dismiss();
        }, error => this.error = error);
    }

    ionViewDidLoad() {
        setTimeout(() => {
            this.name.setFocus();
        },150);
    }
}
