import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { RegistrationService } from 'src/app/registration.service';

@Component({
  selector: 'app-search-delete',
  templateUrl: './search-delete.component.html',
  styleUrls: ['./search-delete.component.css']
})
export class SearchDeleteComponent {
user:any;
email:any;
constructor(private service:RegistrationService, private router:Router){}
  ngOnInit(){
    let resp=this.service.getUsers();
    resp.subscribe((data)=>this.user=data);
  }

  public deleteUser(id:number){

    if(!confirm("Are you sure you want to delete?")) return;

    let resp=this.service.deteletUser(id);
    resp.subscribe((data)=>this.user=data);
    }
   /* public updateUser(id:number){
      let resp=this.service.updateUser(id);
      resp.subscribe((data)=>this.user=data);
    }*/

    public findUserByEmail(){

      let res=this.service.findUserByEmail(this.email);
      res.subscribe((data)=>this.user=data);

    }
    public updateUser(id:number){
      this.router.navigate(['updateuser',id])
    }
    
  

}
