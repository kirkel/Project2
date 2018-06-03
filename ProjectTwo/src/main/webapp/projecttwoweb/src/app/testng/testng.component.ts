import { Component, OnInit } from '@angular/core';
import { HttpRequestService } from '../services/testng-service.service';


@Component({
  selector: 'app-testng',
  templateUrl: './testng.component.html',
  styleUrls: ['./testng.component.css']
})
export class TestngComponent implements OnInit {

  constructor(private httpRequest: HttpRequestService) { }

  ngOnInit() {
  }
  onSubmit(): void {
    this.httpRequest.runTestNG()
          
  }};