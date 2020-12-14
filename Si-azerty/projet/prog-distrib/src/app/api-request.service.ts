import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';


@Injectable({
  providedIn: 'root'
})
export class ApiRequestService {

  constructor(
    private http: HttpClient
  ) { }

  apiCall(){
    return this.http.get('http://localhost:8585/vols')
  }

}
