<?php 
  $dataHeader['titulo'] = "Crear Usuarios";
  $this->load->view('layouts/header', $dataHeader); 
?>
  <?php 
    $dataSidebar['session'] = $session;
    $dataSidebar['optionSelected'] = 'openCrudAjax';
    $this->load->view('layouts/sidebar', $dataSidebar); 
  ?>
  <!-- Content Wrapper. Contains page content -->
  <div class="content-wrapper">
    <div class="col-12 m-0 p-2 bg-white">
      <div class="row justify-content-end">
        <button type="button" class="btn btn-primary" data-toggle="modal" data-target="#modalCrearUsuario">CREAR USUARIO</button>
      </div>
      <table class="table table-bordered">
        <thead>
          <tr>
            <th>CEDULA</th>
            <th>NOMBRES</th>
            <th>APELLIDOS</th>
            <th>TELEFONO</th>
            <th>DIRECCION</th>
            <th>CORREO</th>
            <th></th>
          </tr>
        </thead>
        <tbody id="tbodyPersonas">
          
        </tbody>
      </table> 
    </div>
  </div>

  <div class="modal fade" id="modalCrearUsuario">
    <div class="modal-dialog">
      <form id="formularioCrearUsuario" action="#" method="POST" >
        <div class="modal-content">
          
          <div class="modal-header">
            <h4 class="modal-title">Default Modal</h4>
            <button type="button" class="close" data-dismiss="modal" aria-label="Close">
              <span aria-hidden="true">&times;</span>
            </button>
          </div>
          <div class="modal-body">
            <label for="campo_cedula" class="form-label">CEDULA</label>
            <input type="number" id="campo_cedula" class="form-control" name="campo_cedula" required >
            
            <label for="campo_nombre" class="form-label">NOMBRE</label>
            <input type="text" id="campo_nombre" class="form-control" name="campo_nombre" required >
            
            <label for="campo_apellido" class="form-label">APELLIDO</label>
            <input type="text" id="campo_apellido" class="form-control" name="campo_apellido" required >
            
            <label for="campo_telefono" class="form-label">TELEFONO</label>
            <input type="number" id="campo_telefono" class="form-control" name="campo_telefono" required >
            
            <label for="campo_direccion" class="form-label">DIRECCION</label>
            <input type="text" id="campo_direccion" class="form-control" name="campo_direccion" required >
            
            <label for="campo_email" class="form-label">EMAIL</label>
            <input type="email" id="campo_email" class="form-control" name="campo_email" required >

            <label for="campo_tipo" class="form-label">TIPO</label>
            <select name="campo_tipo" id="campo_tipo" class="form-control" required >
              <option value="ADMIN">ADMIN</option>
              <option value="VENDEDOR">VENDEDOR</option>
            </select>

          </div>
          <div class="modal-footer justify-content-between">
            <button type="button" class="btn btn-default" data-dismiss="modal">Cerrar</button>
            <button type="submit" class="btn btn-primary">Guardar</button>
          </div>
        </div>
        <!-- /.modal-content -->
      </form>
    </div>
    <!-- /.modal-dialog -->
  </div>
  <script src="<?= base_url('dist/js/my_script.js') ?>"></script>
<?php 
  $this->load->view('layouts/footer'); 
?>