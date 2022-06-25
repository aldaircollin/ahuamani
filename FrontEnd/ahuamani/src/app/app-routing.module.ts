import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CrearComponent } from './asignatura/crear/crear.component';
import { AsignaturaComponent } from './asignatura/asignatura.component';
import { InicioComponent } from './inicio/inicio.component';


const routes: Routes = [
  {
    path:'',
    component: InicioComponent
  },
  {
    path:'asignatura',
    component:AsignaturaComponent
  },

  {
    path:'asignatura/form',
    component: CrearComponent
  },
  {
    path:'asignatura/form/:id',
    component: CrearComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
