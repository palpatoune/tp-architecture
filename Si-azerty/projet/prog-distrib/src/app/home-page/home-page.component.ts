import { OnInit } from '@angular/core';
import { Component } from '@angular/core';
import {ApiRequestService} from './../api-request.service'


@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
  displayedColumns: string[] = ['aeroportdepart', 'destination', 'prix', 'code'];
  dataSource = ELEMENT_DATA;

  constructor(private api: ApiRequestService) { }

  ngOnInit(): void {
     this.api.apiCall().subscribe((data)=>{
          console.warn("get api data",data);

        })
  }

}
export interface DepartureData {
  code: string;
  airportDepID: string;
  airportArrID: string;
  prix: number;

}
const ELEMENT_DATA: DepartureData[] = [
  {airportDepID: 'Paris CDG', airportArrID: 'JFK', prix: 1.0079, code: 'H'},
  {airportDepID: 'Detroit DTW', airportArrID: 'CDG', prix: 4.0026, code: 'He'},
  {airportDepID: 'Paris CDG', airportArrID: 'DTW', prix: 6.941, code: 'Li'}
];
export class ButtonTypesExample {}
