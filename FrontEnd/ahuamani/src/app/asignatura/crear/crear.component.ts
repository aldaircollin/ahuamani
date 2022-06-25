import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import Swal from 'sweetalert2';
import { Asignatura } from '../Asignatura';
import { AsignaturaService } from '../asignatura.service';

@Component({
  selector: 'app-crear',
  templateUrl: './crear.component.html'
})
export class CrearComponent implements OnInit {

  titulo: string="Registrar nueva Asignatura";
  asignatura: Asignatura = new Asignatura();

  constructor(private asignaturaService: AsignaturaService,
    private router: Router,
    private activateRoute: ActivatedRoute
    ) { }

  ngOnInit(): void {
  }

  public crearAsignatura(): void{
    this.asignaturaService.registrarAsignatura(this.asignatura).subscribe(
      //response => this.router.navigate(['/asignatura']) anterior
      asignatura => {
        this.router.navigate(['/asignatura'])
       Swal.fire("Enhorabuena",'Se ha registrado de manera satisfactoria',"success")
      }
    )
  }

}
