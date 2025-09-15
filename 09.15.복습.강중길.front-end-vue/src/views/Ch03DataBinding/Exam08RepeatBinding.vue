<!-- 컴포넌트의 UI -->

<template>
  <div class="card">
    <div class="card-header">
      헤더
    </div>
    <div class="card-body">
      <!-- <buttom class="btn btn-info btn-sm" @click="changeState()"></buttom> -->
      <span v-for="n in 3" :key="n" class="me-2">
        <img :src="`/image/${photos[n - 1]}`" width="150" height="120" />
      </span>


      <div class="mt-3">
        <table class="table table-bordered">
          <thead >
            <tr  class="table-info">
              <td>bno</td>
              <td>btitle</td>
              <td>bwriter</td>
              <td>bdate</td>

            </tr>
          </thead>
          <tbody>
            <tr v-for="board in boards" :key="board.bno">
              <td>{{board.bno}}</td>
              <td>{{board.btitle}}</td>
              <td>{{board.bwriter}}</td>
              <td>{{board.bdate}}</td>
            </tr>
          </tbody>
        </table>
      </div>
    </div>
  </div>
</template>



<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup>
import { ref } from 'vue';

// 자바스크립트를 작성
const photos = ref(["photo1.jpg", "photo2.jpg", "Photo3.jpg"]);

const boards = ref([
  { bno: 1, btitle: "제목1", bwriter: "글쓴이1", bdate: '2025-09-09' },
  { bno: 2, btitle: "제목2", bwriter: "글쓴이2", bdate: '2027-09-01' },
  { bno: 3, btitle: "제목3", bwriter: "글쓴이3", bdate: '2029-09-09' }
])

</script>

<!-- scoped : 이 스타일은 이 컴포넌트에서만 적용시킨다 -->
<style scoped></style>