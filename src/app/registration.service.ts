import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private http:HttpClient) { }
  
  public doRegisteration(user: User){
    console.log("doRegisteration");
    return this.http.post("http://localhost:8889/register",user,{responseType:'text' as 'json'}  )

  }
  public getUsers() {
    console.log("getusers");
    return this.http.get("http://localhost:8889/getallusers")

  }
  public deteletUser(id:number){
    console.log("delete");
    return this.http.delete("http://localhost:8889/cancel/"+id);
  }
  
  public findUserByEmail(email:any){
    return this.http.get("http://localhost:8889/findbyemail/"+email);
    console.log("search");
  }
  getUserById(id:number):Observable<User>{
    return this.http.get<User>("http://localhost:8889/findbyid/"+id);
  }

  updateUser(id:number, user:User){
    return this.http.put("http://localhost:8889/update/"+id,user);
  }



}
