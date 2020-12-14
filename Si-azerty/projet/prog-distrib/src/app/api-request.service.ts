import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { Vols } from './vols';
import * as Rx from "rxjs/Rx";
import { from, Observable, throwError } from 'rxjs';
import { map, catchError } from 'rxjs/operators';


@Injectable({
  providedIn: 'root'
})
export class ApiRequestService {

  constructor(
    private http: HttpClient
  ) { }

  apiCall(){
    return this.http.get('https://app-air-travel.azurewebsites.net/flights').
      pipe(
        map((data: Vols[]) => {
        return data;
      }), catchError( error => {
        return throwError( 'Something went wrong!' );
      })
    )
  }

}
