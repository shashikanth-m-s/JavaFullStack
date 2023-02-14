import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { HomeComponent } from './component/home/home.component';
import { RegistrationComponent } from './component/registration/registration.component';
import { SearchDeleteComponent } from './component/search-delete/search-delete.component';
import { UpdateComponent } from './update/update.component';

const routes: Routes = [
  {path:"",redirectTo:"home",pathMatch:"full"},
  {path:"home",component:HomeComponent},
  {path:"register",component:RegistrationComponent},
  {path:"search",component:SearchDeleteComponent},
  {path:"updateuser/:id",component:UpdateComponent}




];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
