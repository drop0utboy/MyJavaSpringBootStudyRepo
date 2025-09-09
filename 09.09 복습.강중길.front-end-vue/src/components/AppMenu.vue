<!-- 컴포넌트의 UI -->
<template>
  <div class="accordion" id="accordionExample">
    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse1"
          aria-expanded="true"
          aria-controls="collapse1"
        >
          Ch01. Vue 시작
        </button>
      </h2>
      <div
        id="collapse1"
        class="accordion-collapse collapse show"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body">
          <ul>
            <li><RouterLink to="/">HomeView</RouterLink></li>
            <li><RouterLink to="/about">HomeAbout</RouterLink></li>
          </ul>
        </div>
      </div>
    </div>
    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button collapsed"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse2"
          aria-expanded="false"
          aria-controls="collapse2"
        >
          Accordion Item #2
        </button>
      </h2>
      <div
        id="collapse2"
        class="accordion-collapse collapse"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body"></div>
          <ul>
            <li><RouterLink to="/Ch02ComponentRouting/Exam01SingleFileComponent">Exam01SingleFileComponent</RouterLink></li>
            <li><RouterLink to="/Ch02ComponentRouting/Exam02FolderComponent">Exam02FolderComponent</RouterLink></li>
            <li><RouterLink to="/Ch02ComponentRouting/Exam03UseUIComponent">Exam03UseUIComponent</RouterLink></li>
            <li><RouterLink to="/Ch02ComponentRouting/Exam04ViewNavigation">Exam04ViewNavigation</RouterLink></li>
            <li><RouterLink to="/Ch02ComponentRouting/Exam05NestedRoute">Exam05NestedRoute</RouterLink></li>

            <li><RouterLink to="/Ch02ComponentRouting/Exam06URLDataSend">Exam06URLDataSend</RouterLink></li>
            <!-- <li><RouterLink to="/Ch02ComponentRouting/Exam06URLDataRecieve">Exam06URLDataRecieve</RouterLink></li> -->
          </ul>
      </div>
    </div>

    <div class="accordion-item">
      <h2 class="accordion-header">
        <button
          class="accordion-button collapsed"
          type="button"
          data-bs-toggle="collapse"
          data-bs-target="#collapse3"
          aria-expanded="false"
          aria-controls="collapse3"
        >
          CH03 DataBinding
        </button>
      </h2>
      <div
        id="collapse3"
        class="accordion-collapse collapse"
        data-bs-parent="#accordionExample"
      >
        <div class="accordion-body"></div>
          <ul>
            <li><RouterLink to="/Ch03DataBinding/Exam01Expressions">Exam01Expressions</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam02NotState">Exam02NotState</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam03State">Exam03State</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam04ComputedFunBinding">Exam04ComputedFunBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam05AttrBinding">Exam05AttrBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam06InnerHtmlBinding">Exam06InnerHtmlBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam07IfShowBinding">Exam07IfShowBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam08RepeatBinding">Exam08RepeatBinding</RouterLink></li>
            <li><RouterLink to="/Ch03DataBinding/Exam09FormBinding">Exam09FormBinding</RouterLink></li>
          </ul>
      </div>
    </div>


  </div>
</template>

<!-- 컴포넌트의 초기화 또는 이벤트 처리 -->
<script setup></script>

<!-- 컴포넌트의 스타일 정의 -->
<style scoped></style>
