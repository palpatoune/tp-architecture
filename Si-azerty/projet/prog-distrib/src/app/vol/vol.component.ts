import { Component, OnInit } from '@angular/core';
export class Vols
{
  get code(): string {
    return this.code;
  }

  set code(value: string) {
    this.code = value;
  }

  get departure(): string {
    return this.departure;
  }

  set departure(value: string) {
    this.departure = value;
  }

  get arrival(): string {
    return this.arrival;
  }

  set arrival(value: string) {
    this.arrival = value;
  }

  get base_price(): number {
    return this.base_price;
  }

  set base_price(value: number) {
    this.base_price = value;
  }

};
@Component({
  selector: 'app-vol',
  templateUrl: './vol.component.html',
  styleUrls: ['./vol.component.css']
})
export class VolComponent {
  private code: string;
  private departure: string;
  private arrival: string;
  private base_price:number;

  constructor(code: string, departure: string,arrival: string,base_price: number) {
    this.code = code;
    this.departure =departure;
    this.arrival =arrival;
    this.base_price =base_price;
  }

  ngOnInit(): void {
  }

}
