import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {HttpClient } from '@angular/common/http';

@Injectable()

export class ProductsService {
    public API = 'http://localhost:3456'
    public PRODUCTS_GET = this.API + '/products';
    public PRODUCTS_POST = this.API + '/productPos';
    public PRODUCTS_PUT = this.API + '/productPut';
    public PRODUCTS_DEL = this.API + '/productDel';
    public PRODUCTS_BY_ID = this.API + '/product';
    public ALL_CATEGORIES = this.API + '/categories';

    constructor(public http: HttpClient) {
    }

    getProducts(): Observable<any> {
        return this.http.get(this.PRODUCTS_GET);
    }

    getProductById(product_id: number): Observable<any> {
        return this.http.get(this.PRODUCTS_BY_ID + '/' + product_id);
    }
    
    getCategories(): Observable<any> {
        return this.http.get(this.ALL_CATEGORIES);
    }

    save(products : any): Observable<any> {
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
        return this.http.delete(this.PRODUCTS_DEL + '/' + id)
    }

}