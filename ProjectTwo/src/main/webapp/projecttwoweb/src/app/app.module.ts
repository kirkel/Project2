import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpModule } from '@angular/http';
import { FormsModule } from '@angular/forms';
import { Routes, RouterModule} from '@angular/router';
import { AppComponent } from './app.component';
import { HomeComponent } from './home/home.component';
import { JasmineComponent } from './jasmine/jasmine.component';
import { ProtractorComponent } from './protractor/protractor.component';
import { HttpClientModule } from '@angular/common/http';
import { TestngComponent } from './testng/testng.component';
import { AboutComponent } from './about/about.component';
import { MyRoutes } from '../shared/app-routes';
import { HttpRequestService } from './services/testng-service.service';



@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
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
    RouterModule.forRoot(MyRoutes)
  ],
  providers: [HttpRequestService],
  bootstrap: [AppComponent]
})
export class AppModule { }