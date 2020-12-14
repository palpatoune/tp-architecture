import { Component } from '@angular/core';
import {ApiRequestService} from './api-request.service';
import { HttpClient } from '@angular/common/http';
import {Vols} from 'vol/vol.component';
class RestService {
  columns = ["code","departure","arrival", "base_price"];
  vol:Vol[]= [];
}

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'prog-distrib';
  constructor(private rs : RestService) { }
  ngOnInit(){

  }

}
