import { Component, OnInit } from '@angular/core';

import * as jquery from 'jquery';
window['jQuery'] = window['$'] = jquery;

import * as tether from 'tether';
window['Tether'] = tether;

@Component({
  selector: 'app-about',
  templateUrl: './about.component.html',
  styleUrls: ['./about.component.css']
})
export class AboutComponent implements OnInit {

  constructor() { }

  ngOnInit() {
  }

}
