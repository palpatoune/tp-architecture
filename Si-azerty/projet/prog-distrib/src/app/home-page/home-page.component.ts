import { OnInit } from '@angular/core';
import { Component } from '@angular/core';


@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
  displayedColumns: string[] = ['aeroportdepart', 'destination', 'prix', 'symbol'];
  dataSource = ELEMENT_DATA;

  constructor() { }

  ngOnInit(): void {
  }

}
export interface DepartureData {
  destination: string;
  aeroportdepart: string;
  prix: number;
  symbol: string;
}
const ELEMENT_DATA: DepartureData[] = [
  {aeroportdepart: 'Paris CDG', destination: 'JFK', prix: 1.0079, symbol: 'H'},
  {aeroportdepart: 'Detroit DTW', destination: 'CDG', prix: 4.0026, symbol: 'He'},
  {aeroportdepart: 'Paris CDG', destination: 'DTW', prix: 6.941, symbol: 'Li'}
];
export class ButtonTypesExample {}
