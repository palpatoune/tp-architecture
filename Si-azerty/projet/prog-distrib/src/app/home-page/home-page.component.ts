import { OnInit } from '@angular/core';
import { Component } from '@angular/core';
import {HttpClient, HttpClientModule} from '@angular/common/http';
import {Vols} from '../../app/vol/vol.component'

function injectable(param: { providedIn: string }) {

}

@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})

export class HomePageComponent {

  displayedColumns: string[] = ['aeroportdepart', 'destination', 'prix', 'code'];
  dataSource = ELEMENT_DATA;
  url: string ='https://app-air-travel.azurewebsites.net/flights';

  constructor(private http : HttpClient) { }
  getUsers()
  {
    return this.http.get<Vols[]>(this.url);
  }

  /*ngOnInit(): void {
     this.url.apiCall().subscribe((data)=>{
          console.warn("get api data",data);

        })
  }*/

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
