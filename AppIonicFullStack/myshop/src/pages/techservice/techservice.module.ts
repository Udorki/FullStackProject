import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { TechservicePage } from './techservice';
import { TechserviceService } from '../../providers/techservice-service';

@NgModule({
  declarations: [
    TechservicePage,
  ],
  imports: [
    IonicPageModule.forChild(TechservicePage),
  ], providers: [
    TechserviceService
  ]
})
export class TechservicePageModule { }
