import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { SeleniumComponent } from './selenium/selenium.component';
import { CucumberComponent } from './cucumber/cucumber.component';
import { JasmineComponent } from './jasmine/jasmine.component';
import { ProtractorComponent } from './protractor/protractor.component';
import { HttpClientModule } from '@angular/common/http';
import { TestngComponent } from './testng/testng.component';
import { AboutComponent } from './about/about.component';

const appRoutes: Routes = [
  { path: '', component: HomeComponent },
  { path: 'about', component: AboutComponent},
  { path: 'selenium', component: SeleniumComponent},
  { path: 'testng', component: TestngComponent},
  { path: 'protractor', component: ProtractorComponent},
  { path: 'jasmine', component: JasmineComponent},
  { path: 'cucumber', component: CucumberComponent}

]

@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    SeleniumComponent,
    CucumberComponent,
    JasmineComponent,
    ProtractorComponent,
    TestngComponent,
    AboutComponent
  ],
  imports: [
    BrowserModule,
    HttpModule,
    FormsModule,
    HttpClientModule,
    RouterModule.forRoot(appRoutes)
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }