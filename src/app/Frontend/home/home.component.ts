import { Component } from '@angular/core';
import { SliderComponent } from '../slider/slider.component';
import { CarouselComponent } from "../carousel/carousel.component";

@Component({
  selector: 'app-home',
  standalone: true,
  imports: [CarouselComponent,SliderComponent ],
  templateUrl: './home.component.html',
  styleUrl: './home.component.css'
})
export class HomeComponent {

}
