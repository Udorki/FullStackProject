import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { ProductsPage } from './products';
import { ProductsService } from '../../providers/products-service';
import { ProductsModalPage } from './products-modal';
import { ProductsUpdatePage } from './products-update';

@NgModule({
    declarations: [
        ProductsPage,
        ProductsModalPage,
        ProductsUpdatePage
    ],
    imports: [
        IonicPageModule.forChild(ProductsPage),
    ],
    providers: [
        ProductsService
    ],
    entryComponents: [
        ProductsModalPage,
        ProductsUpdatePage
    ]
})

export class ProductsPageModule {}