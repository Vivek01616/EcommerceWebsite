import { Component,NgModule} from '@angular/core';
import { CommonModule } from '@angular/common';
interface Product {
  id: number;
  name: string;
  description: string;
  imageUrl: string;
}

@Component({
  selector: 'app-slider',
  standalone: true,
  imports: [CommonModule],
  templateUrl: './slider.component.html',
  styleUrl: './slider.component.css'
})
export class SliderComponent {
  products = [
    { src: 'https://via.placeholder.com/150', title: 'Product 1', description: 'Description of Product 1.' },
    { src: 'https://via.placeholder.com/150', title: 'Product 2', description: 'Description of Product 2.' },
    { src: 'https://via.placeholder.com/150', title: 'Product 3', description: 'Description of Product 3.' },
    { src: 'https://via.placeholder.com/150', title: 'Product 4', description: 'Description of Product 4.' },
    { src: 'https://via.placeholder.com/150', title: 'Product 5', description: 'Description of Product 5.' },
    { src: 'https://via.placeholder.com/150', title: 'Product 6', description: 'Description of Product 6.' },
    { src: 'https://via.placeholder.com/150', title: 'Product 7', description: 'Description of Product 7.' },
    { src: 'https://via.placeholder.com/150', title: 'Product 8', description: 'Description of Product 8.' },
    // Add more products as needed
  ];

  getSlides() {
    const numberOfSlides = Math.ceil(this.products.length / 4);
    return new Array(numberOfSlides);
  }
}

