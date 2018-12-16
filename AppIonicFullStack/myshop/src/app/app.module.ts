import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { HttpClientModule } from '@angular/common/http';

import { MyApp } from './app.component';
import { CartPage } from '../pages/cart/cart';
import { SettingsPage } from '../pages/settings/settings';
import { ListPage } from '../pages/list/list';
import { TabsPage } from '../pages/tabs/tabs';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { ProductsPageModule } from '../pages/products/products.module';
import { HomePageModule } from '../pages/home/home.module';
import { StatusPageModule } from '../pages/status/status.module';
import { TechservicePageModule } from '../pages/techservice/techservice.module';
import { LoginPageModule } from '../pages/login/login.module';
import { ProductsService } from '../providers/products-service';
import { TechserviceService } from '../providers/techservice-service';

@NgModule({
  declarations: [
    MyApp,
    CartPage,
    SettingsPage,
    ListPage,
    TabsPage
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    IonicModule.forRoot(MyApp),
    ProductsPageModule,
    HomePageModule,
    TechservicePageModule,
    StatusPageModule,
    LoginPageModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    CartPage,
    SettingsPage,
    ListPage,
    TabsPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler},
    ProductsService,
    TechserviceService
  ]
})
export class AppModule {}
