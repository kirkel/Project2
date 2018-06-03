import { Routes } from '@angular/router';
import { AppComponent } from '../app/app.component';
import { HomeComponent } from '../app/home/home.component';

import { JasmineComponent } from '../app/jasmine/jasmine.component';
import { ProtractorComponent } from '../app/protractor/protractor.component';
import { TestngComponent } from '../app/testng/testng.component';
import { AboutComponent } from '../app/about/about.component';


export const MyRoutes: Routes = [
    { path: '', component: HomeComponent },
    { path: 'about', component: AboutComponent},
    { path: 'testng', component: TestngComponent},
    { path: 'protractor', component: ProtractorComponent},
    { path: 'jasmine', component: JasmineComponent},
  ]