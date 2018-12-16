import { NgModule } from '@angular/core';
import { IonicPageModule } from 'ionic-angular';
import { LoginPage } from './login';
import { AccountModalPage } from './account-modal';
import { PasswordModalPage } from './password-modal';

@NgModule({
  declarations: [
    LoginPage,
    AccountModalPage,
    PasswordModalPage
  ],
  imports: [
    IonicPageModule.forChild(LoginPage),
  ],
  entryComponents: [
    AccountModalPage,
    PasswordModalPage
  ]
})
export class LoginPageModule {}
