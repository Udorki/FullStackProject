import { BrowserModule } from '@angular/platform-browser';
import { ErrorHandler, NgModule } from '@angular/core';
import { IonicApp, IonicErrorHandler, IonicModule } from 'ionic-angular';
import { HttpClientModule } from '@angular/common/http';

import { MyApp } from './app.component';
import { CartPage } from '../pages/cart/cart';
import { SettingsPage } from '../pages/settings/settings';
import { LoginPage } from '../pages/login/login';
import { ListPage } from '../pages/list/list';
import { TabsPage } from '../pages/tabs/tabs';

import { StatusBar } from '@ionic-native/status-bar';
import { SplashScreen } from '@ionic-native/splash-screen';
import { ProductsPageModule } from '../pages/products/products.module';
import { HomePageModule } from '../pages/home/home.module';
import { StatusPageModule } from '../pages/status/status.module';
import { TechservicePageModule } from '../pages/techservice/techservice.module';

@NgModule({
  declarations: [
    MyApp,
    CartPage,
    SettingsPage,
    LoginPage,
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
    StatusPageModule
  ],
  bootstrap: [IonicApp],
  entryComponents: [
    MyApp,
    CartPage,
    SettingsPage,
    LoginPage,
    ListPage,
    TabsPage
  ],
  providers: [
    StatusBar,
    SplashScreen,
    {provide: ErrorHandler, useClass: IonicErrorHandler}
  ]
})
export class AppModule {}
