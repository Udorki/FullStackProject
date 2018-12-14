import { Component } from '@angular/core';
import { IonicPage, NavController } from 'ionic-angular';
import { TechservicePage } from '../techservice/techservice';
import { StatusPage } from '../status/status';

@IonicPage()
@Component({
  selector: 'page-tabs',
  templateUrl: 'tabs.html'
})
export class TabsPage {

  contactRoot = TechservicePage;
  statusRoot = StatusPage;


  constructor(public navCtrl: NavController) {}

}
