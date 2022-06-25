import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { URL_SERVICIOS } from 'src/environments/environment';
import { Asignatura } from './Asignatura';

@Injectable({
  providedIn: 'root'
})
export class AsignaturaService {

  api = URL_SERVICIOS;
  private httpHeaders = new HttpHeaders({'Content-Type':'application/json'})

  constructor(private http:HttpClient) { }

  listarAsignaturas(): Observable<any>{
    return this.http.get<any>(this.api+"/asignatura/lista")
  }

  registrarAsignatura(asignatura: Asignatura): Observable<any>{
    console.log(asignatura);

    return this.http.post<Asignatura>(this.api+"/asignatura/registrar",asignatura,{headers: this.httpHeaders})
  }

  eliminarAsignatura(id:number): Observable<Asignatura>{
    return this.http.delete<Asignatura>(this.api+"/asignatura/eliminar/"+id,{headers: this.httpHeaders})
  }
}
