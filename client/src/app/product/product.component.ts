import { Component, OnInit } from '@angular/core';
import { Http, Response, Headers } from '@angular/http';

@Component({
  selector: 'app-product',
  templateUrl: './product.component.html',
  styleUrls: ['./product.component.css']
})
export class ProductComponent implements OnInit {

  constructor(private http: Http) { }
  confirmationString:string = "Se añadio un nuevo producto";
  isAdded: boolean = false;
  productObj:object = {};

  addNewProduct = function(product) {
    this.productObj = {
      "name": product.name,
      "cantidad": product.cantidad
    }
    this.http.post("http://localhost:5555/products/", this.productObj).subscribe((res:Response) => {
      this.isAdded = true;
    })
  }

  ngOnInit() {
  }

}

