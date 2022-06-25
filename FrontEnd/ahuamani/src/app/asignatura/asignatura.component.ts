import { Component, OnInit } from '@angular/core';
import { Asignatura } from './Asignatura';
import { AsignaturaService } from './asignatura.service';
import Swal from 'sweetalert2';

@Component({
  selector: 'app-asignatura',
  templateUrl: './asignatura.component.html'
})
export class AsignaturaComponent implements OnInit {

  listaAsignaturas: any;

  constructor(private asignaturaService: AsignaturaService) { }

  ngOnInit(): void {
    this.listarAsignaturas();
  }

  listarAsignaturas(){
    this.asignaturaService.listarAsignaturas().subscribe((res:any) => {
      this.listaAsignaturas = res.data;
    }
    )
  }

}
