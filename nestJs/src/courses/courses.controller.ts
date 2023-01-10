import { Body, Controller, Get, Param ,Post, Res} from '@nestjs/common';


@Controller('courses')
export class CoursesController {
    @Get('list')
    findAll(@Res() response){
        //enviando o status code juntamente com um texto de resposta
        return response.status(200).send('Listando todos os cursos');
    }
    //utilizamos uma implementação mais específica ao invés do params.id
    @Get(':id')
    findOne(@Param('id') id:string){
        return `Listamos o curso de id ${id}` ;
    }

    @Post()
    create(@Body() body){
        return body;
    }
}
