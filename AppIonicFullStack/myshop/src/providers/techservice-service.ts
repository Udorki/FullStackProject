import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient } from '@angular/common/http';

@Injectable()

export class TechserviceService {
    public API = 'http://localhost:3456';
    public REPAIRS_GET = this.API + '/repairs';

    constructor(public http: HttpClient) {
    }

    getRepairs(): Observable<any> {
        return this.http.get(this.REPAIRS_GET);
    }
}