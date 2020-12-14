import { Component } from '@angular/core';
import {ApiRequestService} from './api-request.service';
import { HttpClient } from '@angular/common/http';

class RestService {
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
