import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SigninComponent } from './Frontend/signin/signin.component';
import {SignupComponent} from './Frontend/signup/signup.component';
import { SliderComponent } from './Frontend/slider/slider.component';
import { FooterComponent } from './Frontend/footer/footer.component';
import { NavbarComponent } from './Frontend/navbar/navbar.component';
import { CarouselComponent } from './Frontend/carousel/carousel.component';
import { HomeComponent } from "./Frontend/home/home.component";

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet, SigninComponent, SignupComponent, SliderComponent, FooterComponent, NavbarComponent, FooterComponent, CarouselComponent, HomeComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ecommerce';
}
