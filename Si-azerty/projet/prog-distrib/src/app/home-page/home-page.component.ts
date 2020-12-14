import { OnInit } from '@angular/core';
import { Component } from '@angular/core';
import {ApiRequestService} from './../api-request.service'


@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
  displayedColumns: string[] = ['aeroportdepart', 'destination', 'prix', 'symbol'];
  dataSource = ELEMENT_DATA;

  constructor(private api: ApiRequestService) { }

  ngOnInit(): void {
     this.api.apiCall().subscribe((data)=>{
          console.warn("get api data",data);
          
        })
  }

}
export interface DepartureData {
  id: int;
  airportDepID: string;
  airportArrID: string;
  prix: number;

}
const ELEMENT_DATA: DepartureData[] = [
  {aeroportdepart: 'Paris CDG', destination: 'JFK', prix: 1.0079, symbol: 'H'},
  {aeroportdepart: 'Detroit DTW', destination: 'CDG', prix: 4.0026, symbol: 'He'},
  {aeroportdepart: 'Paris CDG', destination: 'DTW', prix: 6.941, symbol: 'Li'}
];
export class ButtonTypesExample {}
