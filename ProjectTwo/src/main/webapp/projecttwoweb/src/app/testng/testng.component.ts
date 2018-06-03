import { Component, OnInit } from '@angular/core';
import { Http } from '@angular/http';
import { HttpClient } from '@angular/common/http';
import 'rxjs/add/operator/catch';
@Component({
  selector: 'app-testng',
  templateUrl: './testng.component.html',
  styleUrls: ['./testng.component.css']
})
export class TestngComponent implements OnInit {

  constructor(private http: HttpClient) { }

  ngOnInit() {
  }
  runTestNg(): void {
    this.http.post('http://localhost:8080/ServletAngular/runtestng.do', {
    }).subscribe(
      res => {
      console.log(res);
    }
  );
  }

}