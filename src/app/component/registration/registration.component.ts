import { Component, OnInit } from '@angular/core';
import { RegistrationService } from 'src/app/registration.service';
import { User } from 'src/app/user';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {
  user:User=new User("","",0,"");
  message:any;
  ngOnInit(): void {
   

  }
  constructor(private service:RegistrationService){}
  
  public registerNow(){

    console.log("registerNoW")
   let resp=this.service.doRegisteration(this.user);
   resp.subscribe((data)=>this.message=data);

    

  }


}
