import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient } from '@angular/common/http';

@Injectable()

export class ProductsService {
    public API = 'http://localhost:3456'
    public PRODUCTS_GET = this.API + '/product/products';
    public PRODUCTS_POST = this.API + '/product/productPos';
    public PRODUCTS_PUT = this.API + '/product/productPut';
    public PRODUCTS_DEL = this.API + '/product/productDel';
    public PRODUCTS_BY_ID = this.API + '/product/product';
    public ALL_CATEGORIES = this.API + '/category/categories';

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

    getProducts(): Observable<any> {
        // let options = this.getOptions();

        return this.http.get(this.PRODUCTS_GET);
    }

    getProductById(product_id: number): Observable<any> {
        // let options = this.getOptions();

        return this.http.get(this.PRODUCTS_BY_ID + '/' + product_id);
    }
    
    getCategories(): Observable<any> {
        // let options = this.getOptions();

        return this.http.get(this.ALL_CATEGORIES);
    }

    save(products : any): Observable<any> {
        // let options = this.getOptions();

        let result: Observable<Object>;
        let productData = new FormData();
        productData.append("category", products.category);
        productData.append("name", products.name);
        productData.append("price", products.price);
        productData.append("units", products.units);
        result = this.http.post(this.PRODUCTS_POST, productData);
        return result.catch(error => Observable.throw(error));
    }

    updateProducts(products: any, product_id: number): Observable<any> {
        // let options = this.getOptions();

        let result: Observable<Object>;
        let productUpdate = new FormData();
        productUpdate.append("category", products.category);
        productUpdate.append("name", products.name);
        productUpdate.append("price", products.price);
        productUpdate.append("units", products.units);

        result = this.http.put(this.PRODUCTS_PUT + '/' + product_id, productUpdate);
        return result.catch(error => Observable.throw(error));
    }

    remove(id : string) {
        // let options = this.getOptions();

        return this.http.delete(this.PRODUCTS_DEL + '/' + id)
    }

}