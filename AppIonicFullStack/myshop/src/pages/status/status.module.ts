import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { StatusPage } from './status';
import { TechserviceService } from '../../providers/techservice-service';

@NgModule({
  declarations: [
    StatusPage,
  ],
  imports: [
    IonicPageModule.forChild(StatusPage),
  ], providers: [
    TechserviceService
  ]
})
export class StatusPageModule { }
