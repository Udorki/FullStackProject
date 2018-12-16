import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient } from '@angular/common/http';

@Injectable()

export class TechserviceService {
    public API = 'http://localhost:3456';
    public REPAIRS_GET = this.API + '/repair/repairs';

    constructor(public http: HttpClient) {
    }

    // getOptions() {
    //     let user = "kevin";
    //     let password = "kevin";
    //     let base64UserAndPasswordKevin = window.btoa(user + ":" + password);

    //     let basic = 'basic' + base64UserAndPasswordKevin;

    //     let options = {
    //         headers: {
    //             'Authorization' : basic,
    //             'Content-Type' : 'application/x-www-form-urlencoded',
    //         }
    //     };

    //     return options;
    // }

    getRepairs(): Observable<any> {
        // let options = this.getOptions();

        return this.http.get(this.REPAIRS_GET);
    }
}