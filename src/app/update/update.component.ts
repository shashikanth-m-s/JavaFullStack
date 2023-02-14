import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { RegistrationService } from '../registration.service';
import { User } from '../user';

@Component({
  selector: 'app-update',
  templateUrl: './update.component.html',
  styleUrls: ['./update.component.css']
})
export class UpdateComponent implements OnInit{
  user:User=new User("","",0,""); //initially empty values
  //later get the values from html page
id:any;
message:any;
constructor(private userService:RegistrationService,private router:ActivatedRoute,private route:Router){}
ngOnInit(): void {
this.id=this.router.snapshot.params['id'];
let resp= this.userService.getUserById(this.id).subscribe(data=>{
this.user=data;
},error=>console.log(error));

}

updateUser(){
this.userService.updateUser(this.id,this.user).subscribe(data=>{
//navigate to the search-delete component page
this.route.navigate(['/search']);
});


}
}
