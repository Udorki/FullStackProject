import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { HomePage } from './home';
import { ProductsService } from '../../providers/products-service';

@NgModule({
    declarations: [
        HomePage
    ],
    imports: [
        IonicPageModule.forChild(HomePage),
    ],
    providers: [
        ProductsService
    ],
    entryComponents: [
    ]
})

export class HomePageModule {}