import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';
import { SigninComponent } from './Frontend/signin/signin.component';
import {SignupComponent} from './Frontend/signup/signup.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [RouterOutlet,SigninComponent,SignupComponent],
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent {
  title = 'ecommerce';
}
