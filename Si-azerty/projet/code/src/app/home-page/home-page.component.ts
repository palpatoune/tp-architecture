import { OnInit } from '@angular/core';
import { Component } from '@angular/core';
import {ApiRequestService} from './../api-request.service'
import {Vols} from './../vols'


@Component({
  selector: 'app-home-page',
  templateUrl: './home-page.component.html',
  styleUrls: ['./home-page.component.css']
})
export class HomePageComponent implements OnInit {
  vols: Vols[];

  displayedColumns: string[] = ['id', 'airportDepID', 'airportArrID', 'prix'];


  constructor(private api: ApiRequestService) { }

  dataSource =  this.vols;


  ngOnInit(): void {
     this.api.apiCall().subscribe((data : any)=>{
       console.warn("get api data",data);
       this.vols = data



     })




  }

}


export interface DepartureData {
  id: int;
  airportDepID: string;
  airportArrID: string;
  prix: number;

}

export class ButtonTypesExample {}
