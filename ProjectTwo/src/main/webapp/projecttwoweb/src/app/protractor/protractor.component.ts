import { Component, OnInit } from '@angular/core';
import { HttpRequestService } from '../services/testng-service.service';


@Component({
  selector: 'app-protractor',
  templateUrl: './protractor.component.html',
  styleUrls: ['./protractor.component.css']
})
export class ProtractorComponent implements OnInit {

  constructor(private httpRequest: HttpRequestService) { }

  ngOnInit() {
  }
  onSubmit(): void {
    this.httpRequest.runProtractor()
          
  }};