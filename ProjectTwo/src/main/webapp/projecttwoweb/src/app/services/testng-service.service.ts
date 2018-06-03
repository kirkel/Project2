import { HttpErrorResponse, HttpHeaders } from '@angular/common/http';
import { catchError } from 'rxjs/operators';
import { Observable, throwError } from 'rxjs';
import { Injectable, Inject } from '@angular/core';
import { HttpClient } from '@angular/common/http';




@Injectable()
export class HttpRequestService {

    constructor(private http: HttpClient) {
    }

    runTestNG() {
       
        return this.http.get('http://ec2-54-243-8-17.compute-1.amazonaws.com:8080/ProjectTwo/testng.do');
    }

    runProtractor() {
        
        return this.http.get('http://ec2-54-243-8-17.compute-1.amazonaws.com:8080/ProjectTwo/protractor.do');
    }

    private handleError(err: HttpErrorResponse) {
        return throwError(err.message);
      }

}